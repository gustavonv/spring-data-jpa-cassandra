/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.stereotype.Component;

/**
 * @author Brian O'Neill
 */
@Component
public class CassandraPersistenceExceptionTranslator implements PersistenceExceptionTranslator  {

	/*
	  * (non-Javadoc)
	  *
	  * @see org.springframework.dao.support.PersistenceExceptionTranslator#
	  * translateExceptionIfPossible(java.lang.RuntimeException)
	  */
	public DataAccessException translateExceptionIfPossible(RuntimeException ex) {
		return null;
	}
}
