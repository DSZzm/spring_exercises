//designpatterns.abstractfactory.SkinFactory.java
package designpatterns.fabstractfactory;

public interface SkinFactory {
	public Button createButton();
	public TextField createTextField();
	public ComboBox createComboBox();
}