/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.myfaces.extensions.cdi.core.impl.scope.conversation.spi;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowContext;

import java.io.Serializable;

/**
 * @author Gerhard Petracek
 */
public interface WindowContextManager extends Serializable
{
    String WINDOW_CONTEXT_MANAGER_BEAN_NAME = "windowContextManager";

    String WINDOW_CONTEXT_ID_PARAMETER_KEY = "windowId";

    WindowContext getCurrentWindowContext();

    WindowContext getWindowContext(String windowContextId);

    boolean activateWindowContext(String windowContextId);

    boolean activateWindowContext(WindowContext windowContext);

    void resetCurrentWindowContext();

    void resetWindowContext(String windowContextId);

    void resetWindowContext(WindowContext windowContext);

    //TODO
    void resetConversations();

    void resetConversations(String windowContextId);

    void resetConversations(WindowContext windowContext);

    void removeCurrentWindowContext();

    void removeWindowContext(String windowContextId);

    void removeWindowContext(WindowContext windowContext);
}
