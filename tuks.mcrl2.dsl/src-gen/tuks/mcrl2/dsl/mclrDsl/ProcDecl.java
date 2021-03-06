/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getId <em>Id</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getVariables <em>Variables</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getProcDecl()
 * @model
 * @generated
 */
public interface ProcDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(ProcName)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getProcDecl_Id()
   * @model containment="true"
   * @generated
   */
  ProcName getId();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(ProcName value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(VarsDeclList)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getProcDecl_Variables()
   * @model containment="true"
   * @generated
   */
  VarsDeclList getVariables();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(VarsDeclList value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ProcExpr)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getProcDecl_Right()
   * @model containment="true"
   * @generated
   */
  ProcExpr getRight();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.ProcDecl#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ProcExpr value);

} // ProcDecl
