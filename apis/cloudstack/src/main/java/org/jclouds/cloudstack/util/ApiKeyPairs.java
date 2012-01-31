/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
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
package org.jclouds.cloudstack.util;

import org.jclouds.cloudstack.domain.ApiKeyPair;

import java.net.URI;

/**
 * @author Andrei Savu
 */
public class ApiKeyPairs {

   /**
    * Retrieve the API key pair for a given CloudStack user
    *
    * @param endpoint
    *       CloudStack API endpoint (e.g. http://72.52.126.25/client/api/)
    * @param userName
    *       User account name
    * @param password
    *       User password
    * @param domain
    *       Domain name. If empty defaults to ROOT
    * @return
    */
   public static ApiKeyPair getApiKeyPairForUser(URI endpoint, String userName, String password, String domain) {
      return null;
   }
}
