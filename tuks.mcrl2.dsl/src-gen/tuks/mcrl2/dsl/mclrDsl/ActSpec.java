/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.ActSpec#getAct_list <em>Act list</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getActSpec()
 * @model
 * @generated
 */
public interface ActSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Act list</b></em>' containment reference list.
   * The list contents are of type {@link tuks.mcrl2.dsl.mclrDsl.ActDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Act list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act list</em>' containment reference list.
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getActSpec_Act_list()
   * @model containment="true"
   * @generated
   */
  EList<ActDecl> getAct_list();

} // ActSpec
