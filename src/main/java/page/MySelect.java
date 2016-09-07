package page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MySelect extends Select {

	public MySelect(WebElement element) {
		super(element);
	}

	@Override
	public void selectByIndex(int index) {
		String match = String.valueOf(index);

		for (WebElement option : getOptions()) {
			String attribute = option.getAttribute("index");
			if (match.equals(attribute)) {
				setSelected(option, true);
				return;
			}
		}
		throw new NoSuchElementException("Cannot locate option with index: " + index);
	}

	/**
	 * Select or deselect specified option
	 *
	 * @param option
	 *            The option which state needs to be changed
	 * @param select
	 *            Indicates whether the option needs to be selected (true) or
	 *            deselected (false)
	 */
	private void setSelected(WebElement option, boolean select) {
		boolean isSelected = option.isSelected();
		if ((!isSelected && select) || (isSelected && !select)) {
			option.click();
		}
	}

}
