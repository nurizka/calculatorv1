// Generated code from Butter Knife. Do not modify!
package dycode.co.id.calculator;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.inpOne = Utils.findRequiredViewAsType(source, R.id.inp_one, "field 'inpOne'", EditText.class);
    target.inpTwo = Utils.findRequiredViewAsType(source, R.id.inp_two, "field 'inpTwo'", EditText.class);
    target.btnAdd = Utils.findRequiredViewAsType(source, R.id.btn_add, "field 'btnAdd'", Button.class);
    target.btnSubtract = Utils.findRequiredViewAsType(source, R.id.btn_subtract, "field 'btnSubtract'", Button.class);
    target.sntMultiply = Utils.findRequiredViewAsType(source, R.id.snt_multiply, "field 'sntMultiply'", Button.class);
    target.btnDivide = Utils.findRequiredViewAsType(source, R.id.btn_divide, "field 'btnDivide'", Button.class);
    target.btnModulus = Utils.findRequiredViewAsType(source, R.id.btn_modulus, "field 'btnModulus'", Button.class);
    target.textResult = Utils.findRequiredViewAsType(source, R.id.text_result, "field 'textResult'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.inpOne = null;
    target.inpTwo = null;
    target.btnAdd = null;
    target.btnSubtract = null;
    target.sntMultiply = null;
    target.btnDivide = null;
    target.btnModulus = null;
    target.textResult = null;

    this.target = null;
  }
}
