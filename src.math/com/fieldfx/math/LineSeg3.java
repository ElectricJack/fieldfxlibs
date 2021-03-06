/*
  FieldFX Processing Libraries
  Copyright (c) 2011-2013, Jack W. Kern
  
  This library is free software; you can redistribute it and/or
  modify it under the terms of the GNU Lesser General Public
  License as published by the Free Software Foundation; either
  version 2.1 of the License, or (at your option) any later version.

  This library is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
  Lesser General Public License for more details.

  You should have received a copy of the GNU Lesser General
  Public License along with this library; if not, write to the
  Free Software Foundation, Inc., 59 Temple Place, Suite 330,
  Boston, MA  02111-1307  USA
*/
package com.fieldfx.math;

import com.fieldfx.serialize.Serializable;
import com.fieldfx.serialize.Serializer;

public class LineSeg3 implements Serializable {
  
  public Vector3 v0 = new Vector3();
  public Vector3 v1 = new Vector3();
  
  // --------------------------------------------------------------- //
  public LineSeg3() {}
  public LineSeg3( Vector3 v0, Vector3 v1 ) {
    this.v0.set(v0);
    this.v1.set(v1);
  }
  
  // --------------------------------------------------------------- //  
  public Serializable clone()   { return new LineSeg3(); }
  public String       getType() { return "LineSeg3"; }
  public void serialize( Serializer s ) {
    s.serialize( "v0", v0 );
    s.serialize( "v0", v1 );
  }
}
