public class CalcFunctions {

        public Double summ(Object first, Object second){
            return Double.parseDouble(first.toString())+Double.parseDouble(second.toString());
        }

        public Double diff(Object first, Object second){
            return Double.parseDouble(first.toString())-Double.parseDouble(second.toString());
        }

        public Double multy(Object first, Object second){
            return Double.parseDouble(first.toString())*Double.parseDouble(second.toString());
        }

        public Double divide(Object first, Object second){
            return Double.parseDouble(first.toString())/Double.parseDouble(second.toString());
        }
}
