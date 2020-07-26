package controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.nanrailgun.api.TestApi;
import com.nanrailgun.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Reference
    private TestApi testApi;

    @GetMapping("/test/{id}/{name}")
    public String getStudent(@PathVariable("id") String sid,@PathVariable("name") String name) {
        Integer id=Integer.valueOf(sid);
        System.out.println(testApi);
        Student student = testApi.getStudent(id, name);
        System.out.println(student);
        return JSONObject.toJSONString(student);
    }

}
