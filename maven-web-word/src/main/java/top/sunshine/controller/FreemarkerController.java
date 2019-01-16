package top.sunshine.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.sunshine.entity.Resume;
import top.sunshine.util.Resume_word;

public class FreemarkerController {
	@Controller
	@RequestMapping("/freemarker")
	public class FreeMarkerController {

	    
	    @RequestMapping("/downResumeDoc")
	    public String downResumeDoc(HttpServletRequest request,HttpServletResponse response,Resume resume) 
	            throws IOException{
	        request.setCharacterEncoding("utf-8");
	        Map<String,Object> map = new HashMap<String,Object>();
	        /*Enumeration<String> paramNames = request.getParameterNames();
	        //通过循环将表单参数放入键值对映射中
	        while(paramNames.hasMoreElements()){
	            String key  = paramNames.nextElement();
	            String value = request.getParameter(key);
	            map.put(key, value);
	        }*/
	        //给map填充数据
	        map.put("webSite",resume.getWebSite());
	        map.put("createDate1", resume.getCreateDate1());
	        /*map.put("webName",resume.getWebName());
	        map.put("JCSJ", resume.getJCSJ());
	        map.put("EVENTNUM", resume.getEVENTNUM());
	        map.put("LEAKNUM",resume.getLEAKNUM());
	        map.put("HIGHNUM",resume.getHIGHNUM());
	        map.put("MIDDLENUM",resume.getMIDDLENUM());
	        map.put("LOWNUM",resume.getLOWNUM());
	        */
        

	        //提示：在调用工具类生成Word文档之前应当检查所有字段是否完整
	        //否则Freemarker的模板殷勤在处理时可能会因为找不到值而报错，这里暂时忽略这个步骤
	        File file = null;
	        InputStream fin = null;
	        ServletOutputStream out = null;

	        try{
	            //调用工具类WordGenerator的createDoc方法生成Word文档
	            file = Resume_word.createDoc(map, "resume");
	            fin = new FileInputStream(file);

	            response.setCharacterEncoding("utf-8");
	            response.setContentType("application/msword");
	            response.addHeader("Content-Disposition", "attachment;filename=resume.doc");

	            out = response.getOutputStream();
	            byte[] buffer = new byte[1024];//缓冲区
	            int bytesToRead = -1;
	            // 通过循环将读入的Word文件的内容输出到浏览器中  
	            while((bytesToRead = fin.read(buffer)) != -1) {  
	                out.write(buffer, 0, bytesToRead);  
	            }

	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	        finally{
	            if(fin != null) fin.close();  
	            if(out != null) out.close();  
	            if(file != null) file.delete(); // 删除临时文件  
	        }
	        return null;
	    }
	}

}
