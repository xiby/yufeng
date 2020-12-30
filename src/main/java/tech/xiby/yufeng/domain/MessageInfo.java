package tech.xiby.yufeng.domain;

import java.io.Serializable;

/**
 * Message Object
 *
 * @author xiby
 */
public class MessageInfo implements Serializable {

    private EnvironmentInfo environmentInfo;

    private SenseGraphHeader senseGraphHeader;

    public EnvironmentInfo getEnvironmentInfo() {
        return environmentInfo;
    }

    public void setEnvironmentInfo(EnvironmentInfo environmentInfo) {
        this.environmentInfo = environmentInfo;
    }

    public SenseGraphHeader getSenseGraphHeader() {
        return senseGraphHeader;
    }

    public void setSenseGraphHeader(SenseGraphHeader senseGraphHeader) {
        this.senseGraphHeader = senseGraphHeader;
    }
}
