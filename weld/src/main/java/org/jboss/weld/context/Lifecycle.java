/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.context;

import javax.enterprise.context.spi.Context;

/**
 * Note Lifecycle is not complete, and the API may change.
 * 
 * {@link Lifecycle} is a per-deployment service.
 * 
 * @author pmuir
 *
 */
public interface Lifecycle
{

   public void restoreSession(String id, BeanStore sessionBeanStore);

   public void endSession(String id, BeanStore sessionBeanStore);

   public void beginRequest(String id, BeanStore requestBeanStore);

   public void endRequest(String id, BeanStore requestBeanStore);

   public boolean isRequestActive();
   
   public boolean isSessionActive();
   
   public boolean isApplicationActive();
   
   public boolean isConversationActive();

   public void beginApplication(BeanStore applicationBeanStore);

   public void endApplication();

   public Context getApplicationContext();
   
   public Context getSingletonContext();

   public Context getSessionContext();

   public Context getConversationContext();

   public Context getRequestContext();

   public Context getDependentContext();

}
