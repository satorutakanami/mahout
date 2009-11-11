/**
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

package org.apache.mahout.cf.taste.impl.recommender;

import org.apache.mahout.cf.taste.impl.TasteTestCase;
import org.apache.mahout.cf.taste.recommender.Rescorer;

/** <p>Tests {@link NullRescorer}.</p> */
public final class NullRescorerTest extends TasteTestCase {

  public void testItemRescorer() throws Exception {
    Rescorer<Long> rescorer = NullRescorer.getItemInstance();
    assertNotNull(rescorer);
    assertEquals(1.0, rescorer.rescore(1L, 1.0));
    assertEquals(1.0, rescorer.rescore(null, 1.0));
    assertEquals(0.0, rescorer.rescore(1L, 0.0));
    assertTrue(Double.isNaN(rescorer.rescore(1L, Double.NaN)));
  }

  public void testUserRescorer() throws Exception {
    Rescorer<Long> rescorer = NullRescorer.getUserInstance();
    assertNotNull(rescorer);
    assertEquals(1.0, rescorer.rescore(1L, 1.0));
    assertEquals(1.0, rescorer.rescore(null, 1.0));
    assertEquals(0.0, rescorer.rescore(1L, 0.0));
    assertTrue(Double.isNaN(rescorer.rescore(1L, Double.NaN)));
  }

}