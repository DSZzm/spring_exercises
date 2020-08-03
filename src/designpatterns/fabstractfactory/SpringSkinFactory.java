//designpatterns.abstractfactory.SpringSkinFactory.java
package designpatterns.fabstractfactory;

public class SpringSkinFactory implements SkinFactory {
	public Button createButton() {
		return new SpringButton();
	}

	public TextField createTextField() {
		return new SpringTextField();
	}

	public ComboBox createComboBox() {
		return new SpringComboBox();
	}
}