/**
 * generated by Xtext 2.11.0.RC2
 */
package test.multiname.dsl.multiNameDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see test.multiname.dsl.multiNameDsl.MultiNameDslFactory
 * @model kind="package"
 * @generated
 */
public interface MultiNameDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "multiNameDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.multiname.test/dsl/MultiNameDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "multiNameDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MultiNameDslPackage eINSTANCE = test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl.init();

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.ModelImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.ModuleImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VARS = 1;

  /**
   * The feature id for the '<em><b>Funcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FUNCS = 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.NameImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getName_()
   * @generated
   */
  int NAME = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.VarNameImpl <em>Var Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.VarNameImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getVarName()
   * @generated
   */
  int VAR_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NAME__NAME = NAME__NAME;

  /**
   * The number of structural features of the '<em>Var Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NAME_FEATURE_COUNT = NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.FuncNameImpl <em>Func Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.FuncNameImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getFuncName()
   * @generated
   */
  int FUNC_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_NAME__NAME = NAME__NAME;

  /**
   * The number of structural features of the '<em>Func Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_NAME_FEATURE_COUNT = NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.FuncsImpl <em>Funcs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.FuncsImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getFuncs()
   * @generated
   */
  int FUNCS = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCS__LEFT = 0;

  /**
   * The feature id for the '<em><b>Bracket</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCS__BRACKET = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCS__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Funcs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link test.multiname.dsl.multiNameDsl.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see test.multiname.dsl.multiNameDsl.impl.VarsImpl
   * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getVars()
   * @generated
   */
  int VARS = 6;

  /**
   * The feature id for the '<em><b>Var Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR_NAME = 0;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see test.multiname.dsl.multiNameDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link test.multiname.dsl.multiNameDsl.Model#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see test.multiname.dsl.multiNameDsl.Model#getModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Modules();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see test.multiname.dsl.multiNameDsl.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link test.multiname.dsl.multiNameDsl.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link test.multiname.dsl.multiNameDsl.Module#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vars</em>'.
   * @see test.multiname.dsl.multiNameDsl.Module#getVars()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Vars();

  /**
   * Returns the meta object for the containment reference list '{@link test.multiname.dsl.multiNameDsl.Module#getFuncs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funcs</em>'.
   * @see test.multiname.dsl.multiNameDsl.Module#getFuncs()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Funcs();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.VarName
   * @generated
   */
  EClass getVarName();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.FuncName <em>Func Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Func Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.FuncName
   * @generated
   */
  EClass getFuncName();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link test.multiname.dsl.multiNameDsl.Name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.Name#getName()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Name();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.Funcs <em>Funcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Funcs</em>'.
   * @see test.multiname.dsl.multiNameDsl.Funcs
   * @generated
   */
  EClass getFuncs();

  /**
   * Returns the meta object for the containment reference '{@link test.multiname.dsl.multiNameDsl.Funcs#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see test.multiname.dsl.multiNameDsl.Funcs#getLeft()
   * @see #getFuncs()
   * @generated
   */
  EReference getFuncs_Left();

  /**
   * Returns the meta object for the attribute '{@link test.multiname.dsl.multiNameDsl.Funcs#isBracket <em>Bracket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bracket</em>'.
   * @see test.multiname.dsl.multiNameDsl.Funcs#isBracket()
   * @see #getFuncs()
   * @generated
   */
  EAttribute getFuncs_Bracket();

  /**
   * Returns the meta object for the reference '{@link test.multiname.dsl.multiNameDsl.Funcs#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right</em>'.
   * @see test.multiname.dsl.multiNameDsl.Funcs#getRight()
   * @see #getFuncs()
   * @generated
   */
  EReference getFuncs_Right();

  /**
   * Returns the meta object for class '{@link test.multiname.dsl.multiNameDsl.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vars</em>'.
   * @see test.multiname.dsl.multiNameDsl.Vars
   * @generated
   */
  EClass getVars();

  /**
   * Returns the meta object for the containment reference '{@link test.multiname.dsl.multiNameDsl.Vars#getVarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Name</em>'.
   * @see test.multiname.dsl.multiNameDsl.Vars#getVarName()
   * @see #getVars()
   * @generated
   */
  EReference getVars_VarName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MultiNameDslFactory getMultiNameDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.ModelImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODULES = eINSTANCE.getModel_Modules();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.ModuleImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__VARS = eINSTANCE.getModule_Vars();

    /**
     * The meta object literal for the '<em><b>Funcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FUNCS = eINSTANCE.getModule_Funcs();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.VarNameImpl <em>Var Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.VarNameImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getVarName()
     * @generated
     */
    EClass VAR_NAME = eINSTANCE.getVarName();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.FuncNameImpl <em>Func Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.FuncNameImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getFuncName()
     * @generated
     */
    EClass FUNC_NAME = eINSTANCE.getFuncName();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.NameImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME = eINSTANCE.getName_Name();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.FuncsImpl <em>Funcs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.FuncsImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getFuncs()
     * @generated
     */
    EClass FUNCS = eINSTANCE.getFuncs();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCS__LEFT = eINSTANCE.getFuncs_Left();

    /**
     * The meta object literal for the '<em><b>Bracket</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCS__BRACKET = eINSTANCE.getFuncs_Bracket();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCS__RIGHT = eINSTANCE.getFuncs_Right();

    /**
     * The meta object literal for the '{@link test.multiname.dsl.multiNameDsl.impl.VarsImpl <em>Vars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see test.multiname.dsl.multiNameDsl.impl.VarsImpl
     * @see test.multiname.dsl.multiNameDsl.impl.MultiNameDslPackageImpl#getVars()
     * @generated
     */
    EClass VARS = eINSTANCE.getVars();

    /**
     * The meta object literal for the '<em><b>Var Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARS__VAR_NAME = eINSTANCE.getVars_VarName();

  }

} //MultiNameDslPackage
