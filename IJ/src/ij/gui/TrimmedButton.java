package ij.gui;
import i18n.translation;

import java.awt.*;

/** This is an extended Button class used to reduce the width of the HUGE buttons on Mac OS X. */
public class TrimmedButton extends Button {
    private int trim = 0;
    
    public TrimmedButton(String title, int trim) {
        super(translation.tr(title));
        this.trim = trim;
    }

    public Dimension getMinimumSize() {
        return new Dimension(super.getMinimumSize().width-trim, super.getMinimumSize().height);
    }

    public Dimension getPreferredSize() {
        return getMinimumSize();
    }

}
