/**
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.multiNameDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.multiname.dsl.multiNameDsl.Vars#getVarName <em>Var Name</em>}</li>
 * </ul>
 *
 * @see test.multiname.dsl.multiNameDsl.MultiNameDslPackage#getVars()
 * @model
 * @generated
 */
public interface Vars extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Name</em>' containment reference.
   * @see #setVarName(VarName)
   * @see test.multiname.dsl.multiNameDsl.MultiNameDslPackage#getVars_VarName()
   * @model containment="true"
   * @generated
   */
  VarName getVarName();

  /**
   * Sets the value of the '{@link test.multiname.dsl.multiNameDsl.Vars#getVarName <em>Var Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Name</em>' containment reference.
   * @see #getVarName()
   * @generated
   */
  void setVarName(VarName value);

} // Vars
