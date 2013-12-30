import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class CalculateSalesTaxAndTip implements JavaDelegate {
	public void execute(DelegateExecution execution) throws Exception {
		long sum = (long) execution.getVariable("sum");
		
		double salesTax = 0.19 * sum;
		double tip = 0.1 * sum;
		
		execution.setVariable("salesTax", salesTax);
		execution.setVariable("tip", tip);
	}
}
