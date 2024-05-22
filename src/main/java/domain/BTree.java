package domain;

public class BTree implements Tree{
    private BTreeNode root; //unica entrada al arbol

    public BTree(){
        this.root = null;
    }

    @Override
    public int size() throws TreeException {
        if(isEmpty()){
            throw new TreeException("Binary Test is empty");
        }
        return size(root);
    }

    private int size(BTreeNode node){
        if(node==null){
            return 0;
        }else{
            return 1+size(node.left)+size(node.right);
        }

    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object element) throws TreeException {
        return false;
    }

    @Override
    public void add(Object element) {
        //this.root = add(root, element);
        this.root = add(root, element, "root");
    }

//    else if(node.left == null){
//        node.left = add(node.left, element);
//    }else if(node.right == null){
//        node.right = add(node.right, element);
//    }

    private BTreeNode add(BTreeNode node, Object element){
        if(node == null){ //si el arbol esta vacio
            node  = new BTreeNode(element);
        }else{
            //Debemos establecer algun criterio de insercion
            int value = util.Utility.getRandom(10);
            if(value%2==0) //Si es par inserte por la izq
                node.left = add(node.left, element);
            else //si es impar inserte por la derecha
                node.right = add(node.right, element);
        }
        return node;
    }

    private BTreeNode add(BTreeNode node, Object element, String path){
        if(node == null){ //si el arbol esta vacio
            node  = new BTreeNode(element, path);
        }else{
            //Debemos establecer algun criterio de insercion
            int value = util.Utility.getRandom(10);
            if(value%2==0) //Si es par inserte por la izq
                node.left = add(node.left, element, path+"/left");
            else //si es impar inserte por la derecha
                node.right = add(node.right, element, path+"/right");
        }
        return node;
    }

    @Override
    public void remove(Object element) throws TreeException {

    }

    @Override
    public int height(Object element) throws TreeException {
        return 0;
    }

    @Override
    public int height() throws TreeException {
        return 0;
    }

    @Override
    public Object min() throws TreeException {
        return null;
    }

    @Override
    public Object max() throws TreeException {
        return null;
    }

    @Override
    public String preOrder() throws TreeException {
        if(isEmpty()){
            throw new TreeException("Binary Test is empty");
        }
        return preOrder(root) + "\n";
    }

    //node-left-right
    private String preOrder(BTreeNode node){
        String result= "";
        if(node!=null){
            result = node.data + "(" + node.path +"), ";
            result += preOrder(node.left);
            result += preOrder(node.right);
        }
        return result;
    }

    @Override
    public String InOrder() throws TreeException {
        if(isEmpty()){
            throw new TreeException("Binary Test is empty");
        }
        return InOrder(root) + "\n";
    }

    //left-node-right
    private String InOrder(BTreeNode node){
        String result= "";
        if(node!=null){
            result += InOrder(node.left);
            result = node.data + "(" + node.path +"), ";
            result += InOrder(node.right);
        }
        return result;
    }


    @Override
    public String postOrder() throws TreeException {
        if(isEmpty()){
            throw new TreeException("Binary Test is empty");
        }
        return postOrder(root) + "\n";
    }

    //left-right-node
    private String postOrder(BTreeNode node){
        String result= "";
        if(node!=null){
            result += postOrder(node.left);
            result += postOrder(node.right);
            result = node.data + "(" + node.path +"), ";
        }
        return result;
    }

}
