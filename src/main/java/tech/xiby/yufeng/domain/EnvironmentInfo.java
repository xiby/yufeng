package tech.xiby.yufeng.domain;

import java.io.Serializable;
import java.util.List;

/**
 * information about the environment
 *
 * @author xiby
 */
public class EnvironmentInfo implements Serializable {

    /**
     * dimensions of the soccer field in meters
     */
    private float fieldLength;

    private float fieldWidth;

    private float fieldHeight;

    /**
     * dimensions of the goals in meters
     */
    private float goalWidth;

    private float goalDepth;

    private float goalHeight;

    /**
     * gives the distance in meters that agents of the opposite have to adhere when a player carries out a free kick
     */
    private float freeKickDistance;

    /**
     * gives the time in seconds the server waits before automatically starting the game
     */
    private int waitBeforeKickOff;

    /**
     * the radius of each agent in metres
     */
    private float agentRadius;

    /**
     * the radius if the ball in metres
     */
    private float ballRadius;

    /**
     * the mass of the ball in kg
     */
    private float ballMass;

    /**
     * the time in seconds that the server waits after a goal is scored before switching to kick off play mode
     */
    private int ruleGoalPauseTime;

    /**
     * the time in seconds that the server waits after the ball left the field before switching to the kick in play mode
     */
    private int ruleKickInPauseTime;

    /**
     * the length of one half time in seconds
     */
    private int ruleHalfTime;

    /**
     * lists the the different play_modes of the soccer simulation. Later on, play_modes are referenced by a zero based index into this list
     */
    private List<PlayMode> playModes;

    public float getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(float fieldLength) {
        this.fieldLength = fieldLength;
    }

    public float getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(float fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public float getFieldHeight() {
        return fieldHeight;
    }

    public void setFieldHeight(float fieldHeight) {
        this.fieldHeight = fieldHeight;
    }

    public float getGoalWidth() {
        return goalWidth;
    }

    public void setGoalWidth(float goalWidth) {
        this.goalWidth = goalWidth;
    }

    public float getGoalDepth() {
        return goalDepth;
    }

    public void setGoalDepth(float goalDepth) {
        this.goalDepth = goalDepth;
    }

    public float getGoalHeight() {
        return goalHeight;
    }

    public void setGoalHeight(float goalHeight) {
        this.goalHeight = goalHeight;
    }

    public float getFreeKickDistance() {
        return freeKickDistance;
    }

    public void setFreeKickDistance(float freeKickDistance) {
        this.freeKickDistance = freeKickDistance;
    }

    public int getWaitBeforeKickOff() {
        return waitBeforeKickOff;
    }

    public void setWaitBeforeKickOff(int waitBeforeKickOff) {
        this.waitBeforeKickOff = waitBeforeKickOff;
    }

    public float getAgentRadius() {
        return agentRadius;
    }

    public void setAgentRadius(float agentRadius) {
        this.agentRadius = agentRadius;
    }

    public float getBallRadius() {
        return ballRadius;
    }

    public void setBallRadius(float ballRadius) {
        this.ballRadius = ballRadius;
    }

    public float getBallMass() {
        return ballMass;
    }

    public void setBallMass(float ballMass) {
        this.ballMass = ballMass;
    }

    public int getRuleGoalPauseTime() {
        return ruleGoalPauseTime;
    }

    public void setRuleGoalPauseTime(int ruleGoalPauseTime) {
        this.ruleGoalPauseTime = ruleGoalPauseTime;
    }

    public int getRuleKickInPauseTime() {
        return ruleKickInPauseTime;
    }

    public void setRuleKickInPauseTime(int ruleKickInPauseTime) {
        this.ruleKickInPauseTime = ruleKickInPauseTime;
    }

    public int getRuleHalfTime() {
        return ruleHalfTime;
    }

    public void setRuleHalfTime(int ruleHalfTime) {
        this.ruleHalfTime = ruleHalfTime;
    }

    public List<PlayMode> getPlayModes() {
        return playModes;
    }

    public void setPlayModes(List<PlayMode> playModes) {
        this.playModes = playModes;
    }
}
