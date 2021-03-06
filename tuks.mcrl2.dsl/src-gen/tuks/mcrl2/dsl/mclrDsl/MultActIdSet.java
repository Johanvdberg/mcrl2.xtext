/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult Act Id Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.MultActIdSet#getData <em>Data</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.MultActIdSet#isIs_empty <em>Is empty</em>}</li>
 * </ul>
 *
 * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getMultActIdSet()
 * @model
 * @generated
 */
public interface MultActIdSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(MultActIdList)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getMultActIdSet_Data()
   * @model containment="true"
   * @generated
   */
  MultActIdList getData();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.MultActIdSet#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(MultActIdList value);

  /**
   * Returns the value of the '<em><b>Is empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is empty</em>' attribute.
   * @see #setIs_empty(boolean)
   * @see tuks.mcrl2.dsl.mclrDsl.MclrDslPackage#getMultActIdSet_Is_empty()
   * @model
   * @generated
   */
  boolean isIs_empty();

  /**
   * Sets the value of the '{@link tuks.mcrl2.dsl.mclrDsl.MultActIdSet#isIs_empty <em>Is empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is empty</em>' attribute.
   * @see #isIs_empty()
   * @generated
   */
  void setIs_empty(boolean value);

} // MultActIdSet
