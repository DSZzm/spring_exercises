//designpatterns.abstractfactory.Client.java
package designpatterns.fabstractfactory;

public class Client {
	public static void main(String args[]) {
        //??ó??????
		SkinFactory factory;
		Button bt;
		TextField tf;
		ComboBox cb;
		factory = (SkinFactory)XMLUtil.getBean();
		bt = factory.createButton();
		tf = factory.createTextField();
		cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
	}
}