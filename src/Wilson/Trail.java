package Wilson;

public class Trail {
    private int[] markers;

    public Trail(int[] markers){
        this.markers=markers;
    }
    public boolean isLevelTrailSegment(int start, int end){
        int max = markers[start];
        int min = markers[start];
        for(int i = start + 1; i <= end;i++){
            if(min > this.markers[i]){
                min = markers[i];
            }
            else if(max < this.markers[i])
            {
                max = markers[i];
            }
        }

        return ((max-min) <= 10);
    }


    public boolean isDifficult(){
        int numChanges = 0;
        for(int i = 0; i < markers.length -1;i++)
        {
            if (Math.abs(this.markers[i] - this.markers[i + 1]) >= 30)
            {
                numChanges++;
            }
        }
        return (numChanges>=3);
    }
    public boolean thirtyPlus(int a, int b){
        if(Math.abs(a-b)>=30){
            return true;
        }
        return false;
    }
}