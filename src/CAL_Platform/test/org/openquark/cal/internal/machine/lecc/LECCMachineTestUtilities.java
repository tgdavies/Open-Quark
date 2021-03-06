/*
 * Copyright (c) 2007 BUSINESS OBJECTS SOFTWARE LIMITED
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice,
 *       this list of conditions and the following disclaimer.
 *  
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *  
 *     * Neither the name of Business Objects nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *  
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */


/*
 * LECCMachineTestUtilities.java
 * Creation date: May 3, 2006.
 * By: Joseph Wong
 */
package org.openquark.cal.internal.machine.lecc;

import org.openquark.cal.internal.runtime.lecc.LECCMachineConfiguration;


/**
 * A set of helper methods for use in JUnit test cases that need to access information
 * about the LECC machine.
 *
 * @author Joseph Wong
 */
public final class LECCMachineTestUtilities {

    /**
     * Private constructor. This class is not meant to be instantiated.
     */
    private LECCMachineTestUtilities() {
    }

    /**
     * @return whether config flags specify that a lecc runtime would run in the
     *         mode where the runtime is static. i.e. bytecode is retrieved from
     *         disk.
     */
    public static boolean isStaticBytecodeConfig() {
        return LECCMachineConfiguration.isLeccRuntimeStatic();
    }
    
    /**
     * @return whether config flags specify that a lecc runtime would run in the
     *         mode where the runtime is based on generating Java source.
     */
    public static boolean isJavaSourceConfig() {
        return !LECCMachineConfiguration.generateBytecode();
    }
    
    /**
     * @return whether config flags specify that a lecc runtime would run in the
     *         mode where the runtime is dynamic. i.e. bytecode is generated on
     *         the fly as needed.
     */
    public static boolean isDynamicBytecodeConfig() {
        return !isJavaSourceConfig() && !isStaticBytecodeConfig();
    }
}
