/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.bpm.console.client.model;

/**
 * @author Heiko.Braun <heiko.braun@jboss.com>
 */
public class ParticipantRef
{  
  private String type;
  private String idRef;
  private boolean isGroup;

  public ParticipantRef()
  {
  }

  public ParticipantRef(String type, String idRef)
  {
    this.type = type;
    this.idRef = idRef;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public String getIdRef()
  {
    return idRef;
  }

  public void setIdRef(String idRef)
  {
    this.idRef = idRef;
  }

  public boolean isGroup()
  {
    return isGroup;
  }

  public void setGroup(boolean group)
  {
    isGroup = group;
  }
}
