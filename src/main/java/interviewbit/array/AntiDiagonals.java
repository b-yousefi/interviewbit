package interviewbit.array;

import java.util.ArrayList;

class AntiDiagonals {

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A.size() == 0) {
            return result;
        }
        ArrayList<PairIndx> lastSeen = new ArrayList<>();
        lastSeen.add(new PairIndx(0, 0));
        result.add(new ArrayList<>());
        result.get(0).add(A.get(0).get(0));
        for (int i = 1; i < A.size(); i++) {
            ArrayList<PairIndx> newIndx = new ArrayList<>();
            result.add(new ArrayList<>());
            for (PairIndx pairIndx : lastSeen) {
                newIndx.add(new PairIndx(pairIndx.getI(), pairIndx.getJ() + 1));
                result.get(i).add(A.get(pairIndx.getI()).get(pairIndx.getJ() + 1));
            }
            newIndx.add(new PairIndx(lastSeen.get(lastSeen.size() - 1).getI() + 1,
                    lastSeen.get(lastSeen.size() - 1).getJ()));
            result.get(i).add(A.get(lastSeen.get(lastSeen.size() - 1).getI() + 1)
                    .get(lastSeen.get(lastSeen.size() - 1).getJ()));
            lastSeen = newIndx;
        }

        for (int i = A.size(); i < A.size() * 2 - 1; i++) {
            result.add(new ArrayList<>());
            ArrayList<PairIndx> newIndx = new ArrayList<>();
            for (int j = 0; j < lastSeen.size() - 1; j++) {
                newIndx.add(new PairIndx(lastSeen.get(j).getI() + 1, lastSeen.get(j).getJ()));
                result.get(i).add(A.get(lastSeen.get(j).getI() + 1).get(lastSeen.get(j).getJ()));
            }
            lastSeen = newIndx;

        }
        return result;
    }

    static class PairIndx {
        private int i;
        private int j;

        PairIndx(int i, int j) {
            this.i = i;
            this.j = j;
        }

        int getI() {
            return i;
        }

        int getJ() {
            return j;
        }
    }
}
