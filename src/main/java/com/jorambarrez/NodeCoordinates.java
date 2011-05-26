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


/**
 * @author Joram Barrez
 */
public class NodeCoordinates {
  
  protected int column;
  protected int row;
  
  public NodeCoordinates(int column, int row) {
    this.column = column;
    this.row = row;
  }
  
  public int getColumn() {
    return column;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }
  
  @Override
  public String toString() {
    return "(" + column + "," + row + ")";
  }

}
