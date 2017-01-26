/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Expr Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getLower <em>Lower</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getData <em>Data</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getProc_exp_other <em>Proc exp other</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getDataExprUnit()
 * @model
 * @generated
 */
public interface DataExprUnit extends ProcExprTerm
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' containment reference.
   * @see #setLower(DataExprUnitTerm)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getDataExprUnit_Lower()
   * @model containment="true"
   * @generated
   */
  DataExprUnitTerm getLower();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getLower <em>Lower</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' containment reference.
   * @see #getLower()
   * @generated
   */
  void setLower(DataExprUnitTerm value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(DataExprList)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getDataExprUnit_Data()
   * @model containment="true"
   * @generated
   */
  DataExprList getData();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(DataExprList value);

  /**
   * Returns the value of the '<em><b>Proc exp other</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proc exp other</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc exp other</em>' containment reference.
   * @see #setProc_exp_other(ProcExpr)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getDataExprUnit_Proc_exp_other()
   * @model containment="true"
   * @generated
   */
  ProcExpr getProc_exp_other();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.DataExprUnit#getProc_exp_other <em>Proc exp other</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc exp other</em>' containment reference.
   * @see #getProc_exp_other()
   * @generated
   */
  void setProc_exp_other(ProcExpr value);

} // DataExprUnit
