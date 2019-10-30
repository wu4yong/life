/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.demo.consumer;


import com.qili.domain.User;
import com.qili.service.UserJpaService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ConSumerApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();



//        DemoService demoService = context.getBean("demoService", DemoService.class);
//        String hello = demoService.sayHello("world");
//        System.out.println("result: " + hello);
        UserJpaService userJpaService = context.getBean("userJpaService", UserJpaService.class);
        List<User> userList = userJpaService.findAll();
        for(User user: userList){
            System.out.println(user.getId());
            System.out.println(user.getUserName());
            System.out.println(user.getAge());
        }
    }
}
