int b = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;

        try {
            fis = new FileInputStream("C:\\Users\\glins\\OneDrive\\Рабочий стол\\инфа\\Javainput.txt");
            isr = new InputStreamReader(fis);
            while ((b = isr.read()) != -1){
                System.out.println((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
