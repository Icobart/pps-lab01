package tdd;


public class SmartDoorLockImpl implements SmartDoorLock{
    private int pin;
    private enum State{Open, Locked, Blocked}
    private State state;
    private final int maxAttempts;
    private int failedAttempts;

    public SmartDoorLockImpl (int maxAttempts, int failedAttempts) {
        this.state = State.Open;
        this.maxAttempts = maxAttempts;
        this.failedAttempts = failedAttempts;
    }

    @Override
    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock(int pin) {

    }

    @Override
    public void lock() {
        if (this.pin==0) {
            throw new IllegalStateException("Pin not set");
        }
        this.state = State.Locked;
    }

    @Override
    public boolean isLocked() {
        return this.state.equals(State.Locked);
    }

    @Override
    public boolean isBlocked() {
        return false;
    }

    @Override
    public int getMaxAttempts() {
        return this.maxAttempts;
    }

    @Override
    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    @Override
    public void reset() {

    }
}
