

public class MyOpFactory implements OperationFactory{
 
    int operationCode;
    private Operation operation;
    
    @Override
    public Operation getOpInstance(int op) {
        this.operationCode = op;
        switch (operationCode){
            case 0:{
                operation = new SumNums();
                break;
            }
            case 1:{
                operation = new SubtractionNums();
                break;
            }
            case 2:{
                operation = new MultiplicationNums();
                break;
            }
            case 3:{
                operation = new DivisionNums();
                break;
            }
            default:{
                operation = null;
            }
        }
        return operation;
    }
}
