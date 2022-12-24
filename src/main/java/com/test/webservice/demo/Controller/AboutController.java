package com.test.webservice.demo.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.webservice.demo.Model.ResData;

@Controller
public class AboutController {

    /**
     * 
     * @ResponseBody ใช้คู่กับ @RequestMapping ครับ คือการกำหนดว่า ข้อมูลที่ Return
     *               จาก Method นี้ ให้ Response กลับไปให้ Requester เลยนะ
     *               (หากไม่กำหนด Annotation นี้ จะกลายเป็นว่า Spring framework
     *               จะไปหาไฟล์ JSP เพื่อ Execute ต่ออีกทีครับ
     *               ส่วนที่ว่ามันจะไปหาไฟล์ JSP ไฟล์ไหน ก็ขึ้นกับการ Return ของ
     *               Method นี้)
     */

    @RequestMapping(value = "about", method = RequestMethod.GET)
    @ResponseBody
    public ResData about() {
        // * Type 1
        ResData res = new ResData();
        res.setFname("Kriangkrai");
        res.setLname("Ketkun");
        res.setAge(0);
        res.setEmail("xxx@xxx.com");
        res.setPhoneno("000-000-0000");

        // * Type 2
        Map<String, Object> rtn = new LinkedHashMap<>();
        rtn.put("name", "Kriangkraik");
        rtn.put("potato", "King Potato");
        return res;
    }
}
