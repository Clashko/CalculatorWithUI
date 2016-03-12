public class CalcFunctions {
        public Double summer(Object first, Object second){
            return Double.valueOf(first.toString())+Double.valueOf(second.toString());
        }

        public Double diff(Object first, Object second){
            return Double.valueOf(first.toString())-Double.valueOf(second.toString());
        }

        public Double multi(Object first, Object second){
            return Double.valueOf(first.toString())*Double.valueOf(second.toString());
        }

        public Double divide(Object first, Object second){
            return Double.valueOf(first.toString())/Double.valueOf(second.toString());
        }
}
