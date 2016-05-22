/**
 */
package intermediate.tests;

import intermediate.EntitiesContainer;
import intermediate.IntermediateFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entities Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntitiesContainerTest extends TestCase {

	/**
	 * The fixture for this Entities Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitiesContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntitiesContainerTest.class);
	}

	/**
	 * Constructs a new Entities Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitiesContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Entities Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EntitiesContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Entities Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitiesContainer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IntermediateFactory.eINSTANCE.createEntitiesContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EntitiesContainerTest
