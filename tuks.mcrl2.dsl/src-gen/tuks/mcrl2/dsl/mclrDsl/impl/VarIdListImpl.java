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

import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.VarIdList;
import tuks.mcrl2.dsl.mclrDsl.VarName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Id List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.VarIdListImpl#getId_list <em>Id list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarIdListImpl extends MinimalEObjectImpl.Container implements VarIdList
{
  /**
   * The cached value of the '{@link #getId_list() <em>Id list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId_list()
   * @generated
   * @ordered
   */
  protected EList<VarName> id_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarIdListImpl()
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
    return MclrDslPackage.Literals.VAR_ID_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarName> getId_list()
  {
    if (id_list == null)
    {
      id_list = new EObjectContainmentEList<VarName>(VarName.class, this, MclrDslPackage.VAR_ID_LIST__ID_LIST);
    }
    return id_list;
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
      case MclrDslPackage.VAR_ID_LIST__ID_LIST:
        return ((InternalEList<?>)getId_list()).basicRemove(otherEnd, msgs);
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
      case MclrDslPackage.VAR_ID_LIST__ID_LIST:
        return getId_list();
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
      case MclrDslPackage.VAR_ID_LIST__ID_LIST:
        getId_list().clear();
        getId_list().addAll((Collection<? extends VarName>)newValue);
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
      case MclrDslPackage.VAR_ID_LIST__ID_LIST:
        getId_list().clear();
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
      case MclrDslPackage.VAR_ID_LIST__ID_LIST:
        return id_list != null && !id_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VarIdListImpl
