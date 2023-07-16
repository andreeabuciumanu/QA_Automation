package Andreea.OOPExercises;

public class BirdWatcher {
    private int[] birdsPerDay;

    public static void main(String[] args) {
        BirdWatcher birdsFromLastWeek = new BirdWatcher(new int[]{1, 2, 3, 5, 6, 8, 12});
        BirdWatcher birdsFromThisWeek = new BirdWatcher(new int[]{1, 3, 14, 5, 8});
        System.out.println("Birds from last week are: ");
        for (int element : birdsFromLastWeek.getLastWeek()) {
            System.out.println(element);
        }
        System.out.println("Birds from today are: " + birdsFromThisWeek.getToday());
        birdsFromThisWeek.incrementTodaysCount();
        System.out.println("Birds from today after increment are: " + birdsFromThisWeek.getToday());
        System.out.println("There were days without birds? : " + birdsFromThisWeek.hasDayWithoutBirds());
        int theDayCounting = 4;
        System.out.println("The birds visiting us from from day since " + theDayCounting + " 'th day is: "
                + birdsFromThisWeek.getCountForFirstDays(theDayCounting));
        System.out.println("Busy days, those days with more than 5 visitors, are: "
                + birdsFromThisWeek.getBusyDays() + " days");

    }

    public BirdWatcher(int[] birdsPerDay) {

        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        return this.birdsPerDay;
    }

    public int getToday() {

        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {

        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean daysWithoutBirds = false;
        for (int element : this.birdsPerDay) {
            if (element == 0) {
                daysWithoutBirds = true;
                break;
            }
        }
        return daysWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < numberOfDays; i++) {
            count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
