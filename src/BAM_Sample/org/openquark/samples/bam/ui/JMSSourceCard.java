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
 * JMSSourceCard.java
 * Created: 25-Mar-2004
 * By: Rick Cameron
 */

package org.openquark.samples.bam.ui;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openquark.util.ui.WizardCard;



/**
 * 
 * 
 */
class JMSSourceCard extends WizardCard {
    
    private static final long serialVersionUID = -3143576868532386195L;
    static final String CARD_NAME = "JMSQueueSource";

    /**
     * Constructor JMSSourceCard
     * 
     */
    public JMSSourceCard () {
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getTitle()
     */
    @Override
    protected String getTitle () {
        return "JMS Queue";
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getSubtitle()
     */
    @Override
    protected String getSubtitle () {
        return "Select a JMS message queue to use as a message source"; 
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getCardName()
     */
    @Override
    public String getCardName () {
        return CARD_NAME;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getNextCardName()
     */
    @Override
    protected String getNextCardName () {
        return null;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getMainPanel()
     */
    @Override
    protected JComponent getMainPanel () {
        return new JPanel ();
    }

    /**
     * @see org.openquark.util.ui.WizardCard#initControls()
     */
    @Override
    protected boolean initControls () {
        JOptionPane.showMessageDialog(this, "JMS queues are not yet supported", "BAM Sample", JOptionPane.WARNING_MESSAGE);
        
        return false;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#commitChanges()
     */
    @Override
    protected boolean commitChanges () {
        return true;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#canFinish()
     */
    @Override
    protected boolean canFinish () {
        // You will be able to finish on this card, once you can get to it
        return true;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#onFinish()
     */
    @Override
    protected boolean onFinish () {
        return false;
    }

    /**
     * @see org.openquark.util.ui.WizardCard#getTipInfo()
     */
    @Override
    protected TipInfo getTipInfo () {
        // TODO Auto-generated method stub
        return null;
    }

}
