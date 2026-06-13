package com.training.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    //GET 类型接口
    //param传参
    @GetMapping("/get")
    public Map<String, Object> get(String param) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");
        result.put("data", "GET请求，参数为：" + param);
        return result;
    }


    //POST 类型接口
    //requestBody传参
    @PostMapping("/post")
    public Map<String, Object> post(@RequestBody PostRequestParams params) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");
        result.put("data", params);
        return result;
    }

    //POST 类型接口 - 表单传参
    @PostMapping("/postWithForm")
    public Map<String, Object> postWithForm(String param) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");
        result.put("data", "POST请求(表单传参)，参数为：" + param);
        return result;
    }

    //DELETE 类型接口
    @DeleteMapping("/delete")
    public Map<String, Object> delete(String param) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");
        result.put("data", "DELETE请求，参数为：" + param);
        return result;
    }
    
    //PUT 类型接口
    @PutMapping("/put")
    public Map<String, Object> put(@RequestBody PutRequestParams params) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");
        result.put("data", params);
        return result;
    }



    // POST请求参数封装类
    public static class PostRequestParams {
        private String username;
        private String password;
        private Boolean isActive;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Boolean getIsActive() {
            return isActive;
        }

        public void setIsActive(Boolean isActive) {
            this.isActive = isActive;
        }

        @Override
        public String toString() {
            return "PostRequestParams{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", isActive=" + isActive +
                    '}';
        }
    }

    // PUT请求参数封装类
    public static class PutRequestParams {
        private Long id;
        private String data;
        private Double score;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "PutRequestParams{" +
                    "id=" + id +
                    ", data='" + data + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}
