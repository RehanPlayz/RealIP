package net.tcpshield.tcpshield.validation.impl;

import net.tcpshield.tcpshield.validation.ITimestampValidator;

/**
 * @author Fuzzlemann
 */
public class DisabledTimestampValidatorImpl implements ITimestampValidator {
    @Override
    public boolean validateTimestamp(long checkedTimestamp) {
        return true;
    }
}
