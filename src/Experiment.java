import java.util.Arrays;

public class Experiment {

    private Sorter sorter;
    private Searcher searcher;

    public Experiment() {
        sorter = new Sorter();
        searcher = new Searcher();
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long startTime = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        sorter.advancedSort(copy);

        long startTime = System.nanoTime();
        searcher.search(copy, target);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000, 5000};

        for (int size : sizes) {
            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = sorter.generateSortedArray(size);

            runExperimentForArray(randomArray, "Random", size);
            runExperimentForArray(sortedArray, "Sorted", size);

            System.out.println("-----------------------------------");
        }
    }

    private void runExperimentForArray(int[] arr, String inputType, int size) {
        int target = arr[arr.length / 2];

        long basicSortTime = measureSortTime(arr, "basic");
        long advancedSortTime = measureSortTime(arr, "advanced");
        long searchTime = measureSearchTime(arr, target);

        System.out.println("Array size: " + size);
        System.out.println("Input type: " + inputType);
        System.out.println("Insertion Sort time: " + basicSortTime + " ns");
        System.out.println("Merge Sort time: " + advancedSortTime + " ns");
        System.out.println("Binary Search time: " + searchTime + " ns");
        System.out.println();
    }
}