public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);

        int[] seq = new int[args.length];
        int[] cumSums = new int[args.length + 1];


        // Creating Array of command line args

        for (int i = 1; i < args.length; i++) {
            seq[i] = Integer.parseInt(args[i]);
        }

        // Creating Array of Cumulative Sums
        cumSums[0] = 0;

        for (int j = 1; j < cumSums.length; j++) {
            cumSums[j] = cumSums[j - 1] + seq[j - 1];
        }

        // Generating random number
        for (int t = 0; t < m; t++) {
            int r = (int) (Math.random() * (cumSums[cumSums.length - 1]) - cumSums[0]) + cumSums[0];


            for (int i = 0; i < cumSums.length; i++) {
                if (r >= cumSums[i] && r < cumSums[i + 1]) {
                    System.out.print((i) + " ");
                }

            }

        }


    }
}
