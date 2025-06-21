package searching;

public class VersionControl {
    private int bad;

    public void setBadVersion(int bad) {
        this.bad = bad;
    }

    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}
