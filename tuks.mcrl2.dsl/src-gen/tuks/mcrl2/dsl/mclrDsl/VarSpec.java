/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.VarSpec#getList <em>List</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getVarSpec()
 * @model
 * @generated
 */
public interface VarSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link tuks.mcrl2.dsl.mclrDsl.VarsDeclList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getVarSpec_List()
   * @model containment="true"
   * @generated
   */
  EList<VarsDeclList> getList();

} // VarSpec
