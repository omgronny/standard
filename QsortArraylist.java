class Sort{
    public void asort(ArrayList<Double> sp, int low, int high, ArrayList<Integer> sv, ArrayList<Integer> ss){

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        double opora = sp.get(middle);


        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (opora > sp.get(i)) {
                i++;
            }

            while (sp.get(j) > opora) {
                j--;
            }

            if (i <= j) {//меняем местами

                double temp = sp.get(i);
                sp.set(i, sp.get(j));
                sp.set(j, temp);

                i++;
                j--;
            }
        }
        if (low < j)
            asort(sp, low, j, sv, ss);

        if (high > i)
            asort(sp, i, high, sv, ss);
    }
}
