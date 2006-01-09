/*
 * Copyright 2005-2006 J�r�me LOUVEL
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * http://www.opensource.org/licenses/cddl1.txt
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * http://www.opensource.org/licenses/cddl1.txt
 * If applicable, add the following below this CDDL
 * HEADER, with the fields enclosed by brackets "[]"
 * replaced with your own identifying information:
 * Portions Copyright [yyyy] [name of copyright owner]
 */

package com.noelios.restlet.data;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

import org.restlet.data.MediaType;

/**
 * Representation based on a readable byte channel.
 */
public class ReadableRepresentation extends ChannelRepresentation
{
   /** The representation's input stream. */
   protected ReadableByteChannel readableChannel;

   /**
    * Constructor.
    * @param readableChannel The representation's channel.
    * @param mediaType The representation's media type.
    */
   public ReadableRepresentation(ReadableByteChannel readableChannel, MediaType mediaType)
   {
      super(mediaType);
      this.readableChannel = readableChannel;
   }

   /**
    * Returns a readable byte channel. If it is supported by a file a read-only instance of FileChannel is
    * returned.
    * @return A readable byte channel.
    */
   public ReadableByteChannel getChannel() throws IOException
   {
      return readableChannel;
   }

}
