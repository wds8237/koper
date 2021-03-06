/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhaimi.message;

/**
 * MsgBeanListener.
 * koper-core框架中负责接收消息的最底层接口。msgBean对象包含了最原始的json消息格式。
 * @author kk hekun@zhai.me
 * @since 1.0
 * 2016年2月19日
 *
 */
public interface MsgBeanListener {
	/**
	 * @see com.zhaimi.message.MessageListener#onMessage(java.lang.String)
	 */
	public void onMsgBean(MsgBean<String,String> msgBean) ;

}
