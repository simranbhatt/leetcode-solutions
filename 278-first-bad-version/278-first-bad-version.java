/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int currentBadVersion) {
        int firstVersion = 0;
        int lastVersion = currentBadVersion; 
        int mid;
        while(firstVersion <= lastVersion) {
            mid = firstVersion + (lastVersion - firstVersion)/2;
            if(isBadVersion(mid)) {
                if(mid < currentBadVersion)
                    currentBadVersion = mid;
                lastVersion = mid-1;
            } else {
                firstVersion = mid+1;
            }
        }
        return currentBadVersion;
    }
}