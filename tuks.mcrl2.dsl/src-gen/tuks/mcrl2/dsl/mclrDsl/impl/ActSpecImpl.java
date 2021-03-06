/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tuks.mcrl2.dsl.mclrDsl.ActDecl;
import tuks.mcrl2.dsl.mclrDsl.ActSpec;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.ActSpecImpl#getAct_list <em>Act list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActSpecImpl extends MinimalEObjectImpl.Container implements ActSpec
{
  /**
   * The cached value of the '{@link #getAct_list() <em>Act list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct_list()
   * @generated
   * @ordered
   */
  protected EList<ActDecl> act_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MclrDslPackage.Literals.ACT_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActDecl> getAct_list()
  {
    if (act_list == null)
    {
      act_list = new EObjectContainmentEList<ActDecl>(ActDecl.class, this, MclrDslPackage.ACT_SPEC__ACT_LIST);
    }
    return act_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MclrDslPackage.ACT_SPEC__ACT_LIST:
        return ((InternalEList<?>)getAct_list()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MclrDslPackage.ACT_SPEC__ACT_LIST:
        return getAct_list();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclrDslPackage.ACT_SPEC__ACT_LIST:
        getAct_list().clear();
        getAct_list().addAll((Collection<? extends ActDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.ACT_SPEC__ACT_LIST:
        getAct_list().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.ACT_SPEC__ACT_LIST:
        return act_list != null && !act_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActSpecImpl
