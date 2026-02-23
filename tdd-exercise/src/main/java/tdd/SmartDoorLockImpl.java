package tdd;


public class SmartDoorLockImpl implements SmartDoorLock{
    private int pin;
    private enum State{Open, Locked, Blocked}
    private State state;

    public SmartDoorLockImpl () {
        this.state = State.Open;
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
        try {
            if (this.pin!=0) {
                this.state = State.Locked;
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
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
        return 0;
    }

    @Override
    public int getFailedAttempts() {
        return 0;
    }

    @Override
    public void reset() {

    }
}
