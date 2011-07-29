/* Licensed under the Apache License, Version 2.0 (the "License");
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

package com.jorambarrez;

import com.vaadin.ui.Component;



/**
 * @author Joram Barrez
 */
public interface Node extends Component {

  static enum STATE {EMPTY, PROCESS_STEP, CANDIDATE};
  
  public static final int DEFAULT_NODE_WIDTH = 100;
  public static final int DEFAULT_NODE_HEIGHT = 50;
  public static final int EMPTY_NODE_HEIGHT = 25;
  public static final int HEIGHT_BETWEEN_NODES = DEFAULT_NODE_HEIGHT / 2;
  
  public boolean isProcessStep();
  public boolean isEmpty();
  public boolean isCandidate();
  public void changeState(STATE state);
  
  public int getNodeWidth();
  public void setNodeWidth(int width);
  public void setNodeHeight(int height);
  public int getNodeHeight();
  public void setText(String text);
  
}
